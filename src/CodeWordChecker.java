public class CodeWordChecker implements StringChecker {
  private String nope;
  private int start;
  private int end;

  public CodeWordChecker(int minLen, int maxLen, String symbol)
  {
    this.nope = symbol;
    this.start = minLen;
    this.end = maxLen;
  }
  public CodeWordChecker(String symbol)
  {
    this.start = 6;
    this.end = 20;
    this.nope = symbol;
  }

    @Override
    public boolean isValid(String str)
    {
      if (str.indexOf(this.nope) == -1 && str.length() >= this.start && str.length() <= this.end)
      {
        return true;
      }
      return false;
    }
}
