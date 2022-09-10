public class StringOperator {
    public static void main(String[] args) {
        String text = "Vụ 42 lao động Việt tháo chạy khỏi sòng bạc Campuchia: " +
                "Đã tìm thấy thi thể thiếu niên 16 tuổi mất tích trên sông Bình Di";
//        char[] textChar = text.toCharArray();
//        char[] textRevertArr = new char[text.length()];
//        for (int i = 0; i <= text.length() ; i ++) {
//            if ( )
//        }
//        System.out.println(textRevertArr);
        char[] textArr = text.toCharArray();
        for (int i = 1; i < textArr.length; i ++) {
            System.out.println(textArr[i]);
        }
    }
}
