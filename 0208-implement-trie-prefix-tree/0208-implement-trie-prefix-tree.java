class Trie {

    class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        public TrieNode() {
            children = new TrieNode[26]; 
            isEnd = false;
        }
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }


    public boolean search(String word) {
        TrieNode node = findNode(word);
        return node != null && node.isEnd;
    }


    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }


    private TrieNode findNode(String str) {
        TrieNode node = root;
        for (char ch : str.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}