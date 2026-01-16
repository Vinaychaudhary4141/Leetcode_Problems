// Last updated: 1/16/2026, 10:12:35 PM
class Solution {
    public String generateTag(String caption) {
        caption = caption.trim();
        StringBuilder str = new StringBuilder("#");
        for (int i = 0; i < caption.length(); i++) {
            if (caption.charAt(i) == ' ') {
                while (i < caption.length() && caption.charAt(i) == ' ') {
                    i++;
                }
                if (i < caption.length()) {
                    str.append(Character.toUpperCase(caption.charAt(i)));
                }
            }else {
                str.append(Character.toLowerCase(caption.charAt(i)));
            }
        }
        return (str.length() > 100) ? str.substring(0, 100) : str.toString();
    }
}
