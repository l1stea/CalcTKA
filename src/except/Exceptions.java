package except;

public class Exceptions {
    public boolean checkArabic;
    public boolean checkRoman;

    public Exceptions(String[] words) {
        this.Check(words);
    }

    public void Check(String[] words) {
        this.checkArabic = false;
        this.checkRoman = false;
        FormatString fs = new FormatString(words);
        if (fs.check) {
            DataType dt1 = new DataType(words[0]);
            DataType dt2 = new DataType(words[2]);
            if (dt1.checkArabic & dt2.checkArabic) {
                this.checkArabic = true;
                OutRangeArabic outrangeArabic = new OutRangeArabic(words);
                if (outrangeArabic.check) {
                    this.checkArabic = false;
                    return;
                }
            }

            if (dt1.checkRoman & dt2.checkRoman) {
                this.checkRoman = true;
                OutRangeRoman outrangeRoman = new OutRangeRoman(words);
                if (outrangeRoman.check) {
                    this.checkRoman = false;
                }
            }

        }
    }
}