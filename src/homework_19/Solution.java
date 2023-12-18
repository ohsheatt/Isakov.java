package homework_19;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private Object[] array;
    private Object variableV;
    private Object variableK;

    public Solution(Object[] array, Object variableV, Object variableK) {
        this.array = array;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    public List<Object> convertArrayToList() {
        List<Object> list = new ArrayList<>();
        for (Object element : array) {
            list.add(element);
        }
        return list;
    }

    public Object getElementAtIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        }
        return null;
    }

    public void listFilesInDirectory(String path) {
        File directory = new File(path);
        File[] files = directory.listFiles();

        List<File> fileList = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                fileList.add(file);
            }
        }

        for (int i = 0; i < 5 && i < fileList.size(); i++) {
            System.out.println(fileList.get(i).getName());
        }
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static <K, V> HashMap<K, V> newHashMap(Class<K> keyClass, Class<V> valueClass) {
        return new HashMap<>();
    }

    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three"};
        Solution solution = new Solution(strings, 5, "variable");

        List<Object> stringList = solution.convertArrayToList();
        System.out.println("Список строк: " + stringList);

        Object element = solution.getElementAtIndex(1);
        System.out.println("Элемент по индексу 1: " + element);

        String directoryPath = "/path/to/directory";
        solution.listFilesInDirectory(directoryPath);

        ArrayList<Integer> intList = Solution.newArrayList(1, 2, 3, 4, 5,7,9);
        System.out.println("Список целых чисел: " + intList);

        HashMap<String, Integer> hashMap = Solution.newHashMap(String.class, Integer.class);
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        System.out.println("Hash Map: " + hashMap);
    }
}
