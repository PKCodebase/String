package string;

public class StudentAttendenceRecord {
    public boolean checkRecord(String s) {
        int a = 0, l = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                a++;
                if (a >= 2) return false;
            }

            if (s.charAt(i) == 'L') {
                l++;
                if (l >= 3) return false;
            } else {
                l = 0;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "PPALLP";
        StudentAttendenceRecord solution = new StudentAttendenceRecord();
        System.out.println(solution.checkRecord(s));
    }
}
