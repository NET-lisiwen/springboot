
public class StringTest {
    public static void main(String[] args) {
        String str = "1";
        String str1 = "1";
        StringBuffer sbf = new StringBuffer("1");
        StringBuffer sbf1 = new StringBuffer("1");
        StringBuilder sbd = new StringBuilder("1");
        StringBuilder sbd1 = new StringBuilder("1");
        System.out.println("----  euqals 比较  ----");
        boolean stringEqualString = str.equals(str1);
        boolean stringBuilderEqualStringBuilder = sbd.equals(sbd1);
        boolean stringBufferEqualStringBuffer = sbf.equals(sbf1);
        System.out.println("String和String比较结果：" + stringEqualString);
        System.out.println("StringBuilder和StringBuilder比较结果：" + stringBuilderEqualStringBuilder);
        System.out.println("StringBuffer和StringBuffer比较结果：" + stringBufferEqualStringBuffer);
        boolean stringEqualStringBuffer = str.equals(sbf);
        boolean stringEqualStringBuilder = str.equals(sbd);
        boolean stringBufferEqualStringBuilder = sbf.equals(sbd);
        System.out.println("String和StringBuffer比较结果：" + stringEqualStringBuffer);
        System.out.println("String和StringBuilder比较结果：" + stringEqualStringBuilder);
        System.out.println("StringBuffer和StringBuilder比较结果：" + stringBufferEqualStringBuilder);
        System.out.println("----  == 比较  ----");
        boolean stringEqualString1 = str == str1;
        boolean stringBuilderEqualStringBuilder1 = sbd == sbd1;
        boolean stringBufferEqualStringBuffer1 = sbf == sbf1;
        System.out.println("String和String比较结果：" + stringEqualString1);
        System.out.println("StringBuilder和StringBuilder比较结果：" + stringBuilderEqualStringBuilder1);
        System.out.println("StringBuffer和StringBuffer比较结果：" + stringBufferEqualStringBuffer1);
    }
}