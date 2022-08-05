package exercicio4;

public class RecursivityUtils {

  String getReversedString(String str, int letterId, String result) {
    if (letterId == 0) return result;
    

    result += str.charAt(letterId - 1);
    letterId = letterId - 1;
    return getReversedString(str, letterId, result);
  }

  String reverseString(String str) {
    return getReversedString(str, str.length(), "");
  }
}
