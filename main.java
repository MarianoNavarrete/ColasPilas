import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {

	public static void main(String[] args) throws IOException {
		/*
		 Queues are data structures that add a new value at the end and remove the first value FIFO
		 Stacks are data structure that add a new value at the head and remove the head value LIFO
		 this data structures are in the java.collections package
		 */
		
		Queue<String> tickets = new LinkedList<String>();
		tickets.add("one");
		tickets.add("two");
		tickets.add("three");
		System.out.println(tickets.peek());
		tickets.remove();
		System.out.println(tickets);
		Stack<String> books = new Stack<String>();
		Queue<HtmlTag> tags = HtmlReader.getTagsFromHtmlFile("html.txt");
		System.out.println(HtmlValidator.isValidHtml(tags));
	}

}
