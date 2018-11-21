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
    this.nope = symbol;
  }

    @Override
    public boolean isValid(String str)
    {
      if (str.indexOf(this.nope) == -1 && str.length() >= this.start && str.length() <= this.end)
      {
        return true;
      }
      else if (str.indexOf(this.nope) == -1 && str.length() <= 20 && str.length() >= 6)
      {
        return true;
      }
      return false;
    }
}
