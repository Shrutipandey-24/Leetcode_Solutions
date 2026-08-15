class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if (!wordList.contains(endWord)) {
            return 0;
        }

        Set<String> wordSet = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();

        Queue<String> q = new LinkedList<>();

        q.offer(beginWord);
        visited.add(beginWord);

        int length = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                String current = q.poll();

                for (int j = 0; j < current.length(); j++) {

                    char[] temp = current.toCharArray();

                    for (char ch = 'a'; ch <= 'z'; ch++) {

                        temp[j] = ch;
                        String newWord = new String(temp);

                        if (newWord.equals(endWord)) {
                            return length + 1;
                        }

                        if (wordSet.contains(newWord)
                                && !visited.contains(newWord)) {

                            visited.add(newWord);
                            q.offer(newWord);
                        }
                    }
                }
            }

            length++;
        }

        return 0;
    }
}