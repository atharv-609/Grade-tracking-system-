import java.util.*;

public class Chatbot {
    static Map<String, String> faq = new HashMap<>();
    static {
        faq.put("hello", "Hi! How can I assist?");
        faq.put("bye", "Goodbye!");
        faq.put("price", "Please specify which product price you want to know.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chatbot ready. Type your query:");
        while(true){
            String input = sc.nextLine().toLowerCase();
            if(input.equals("exit")) break;
            boolean found = false;
            for(String key : faq.keySet()) {
                if(input.contains(key)) {
                    System.out.println(faq.get(key));
                    found = true;
                    break;
                }
            }
            if(!found) System.out.println("Sorry, I don't understand.");
        }
    }
}
