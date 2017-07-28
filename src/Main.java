import java.util.*;

public class Main {

    private static final int STUDENT_COUNT = 15;
    private static final int TEACHER_COUNT = 3;
    private static final String[] FIRST_NAMES = new String[]{"John", "Keegan", "Joe", "Robert", "Rob", "Landi",
            "Marshall", "Jordan", "Ian", "Zack", "Tanner", "Rick", "Jullian", "Charles", "Mysterio"};
    private static final String[] LAST_NAMES = new String[]{"Smith", "Munoz", "Pilkinton", "Ocable", "Hieghdotting", "Booth",
            "Middleton", "Mccord", "Minner", "Benton", "Herring", "Barber", "Duensing", "Heibert", "Nigrette"};

    public static void main(String[] args) {
        List<Student> firstGraders = new ArrayList<>();
        Student student;
        for (int i = 0; i < STUDENT_COUNT; i++) {
            student = new Student();
            student.setFirstName(FIRST_NAMES[i]);
            student.setLastName(LAST_NAMES[i]);
            student.setGrade(1);
            student.setId(i);
            firstGraders.add(student);
        }

        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher;
        for (int i = 0; i < TEACHER_COUNT; i++) {
            teacher = new Teacher();
            teacher.setFirstName(FIRST_NAMES[i+4]); // pseudo-random
            teacher.setLastName(LAST_NAMES[(i+1)*3]); // pseudo-random
            teacher.setGrade(1);
            teacher.setId(i);
            teachers.add(teacher);
        }
        for (Teacher t : teachers) {
            System.out.println(t);
        }

        Set<Student> studentSet1 = new HashSet<>();
        Set<Student> studentSet2 = new HashSet<>();
        Set<Student> studentSet3 = new HashSet<>();
        for (int i = 0; i < STUDENT_COUNT; i++) {
            if (i < 5) {
                studentSet1.add(firstGraders.get(i));
            } else if (i < 10) {
                studentSet2.add(firstGraders.get(i));
            } else {
                studentSet3.add(firstGraders.get(i));
            }
        }

        Map<Teacher, Set> firstGradeClasses = new HashMap<>();
        for (int i = 0; i < TEACHER_COUNT; i++) {
            if (i == 0) {
                firstGradeClasses.put(teachers.get(i), studentSet1);
            } else if (i == 1) {
                firstGradeClasses.put(teachers.get(i), studentSet2);
            } else {
                firstGradeClasses.put(teachers.get(i), studentSet3);
            }
        }

        System.out.println(firstGradeClasses.keySet());
        System.out.println(firstGradeClasses.values());
        System.out.println(firstGradeClasses.entrySet());
    }
}