public class Task1 {
    public static void main(String[] args) {
        String[] input = {"a", "ab", "abc", "cd", "def", "gh"};
        String[] result = timChuoiCoDoDaiXuatHienNhieuNhat(input);
        
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static String[] timChuoiCoDoDaiXuatHienNhieuNhat(String[] chuoi) {
        int[] soLuongTheoDoDai = new int[50]; 
        int doDaiMax = 0;

        for (String str : chuoi) {
            int doDai = str.length();
            soLuongTheoDoDai[doDai]++;
            if (doDai > doDaiMax) {
                doDaiMax = doDai;
            }
        }

        int maxTanSuat = 0;
        int doDaiXuatHienNhieuNhat = 0;

        for (int i = 0; i <= doDaiMax; i++) {
            if (soLuongTheoDoDai[i] > maxTanSuat) {
                maxTanSuat = soLuongTheoDoDai[i];
                doDaiXuatHienNhieuNhat = i;
            }
        }

        String[] result = new String[maxTanSuat];
        int index = 0;

        for (String str : chuoi) {
            if (str.length() == doDaiXuatHienNhieuNhat) {
                result[index++] = str;
            }
        }

        return result;
    }
}
