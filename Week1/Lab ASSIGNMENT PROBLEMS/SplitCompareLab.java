

// Custom split method
static String[] customSplit(String text) {
    text = text.trim(); // remove leading/trailing spaces
    if (findLength(text) == 0) return new String[0]; // handle empty input

    int len = findLength(text);
    int spaces = 0;

    // Count spaces to determine number of words
    for (int i = 0; i < len; i++)
        if (text.charAt(i) == ' ') spaces++;

    String[] words = new String[spaces + 1];
    int start = 0, index = 0;

    // Extract words using indexes
    for (int i = 0; i < len; i++) {
        if (text.charAt(i) == ' ') {
            if (start != i) { // skip multiple spaces
                words[index++] = text.substring(start, i);
            }
            start = i + 1;
        }
    }
    if (start < len) words[index] = text.substring(start); // last word
    return words;
}
