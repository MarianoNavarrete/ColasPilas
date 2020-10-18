import java.util.Queue;
import java.util.Stack;

/*
 * SD2x Homework #2
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

public class HtmlValidator {
	
	public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {
		Stack<HtmlTag> resolve = new Stack<HtmlTag>();
		while(!tags.isEmpty()) {
			if(!tags.peek().isSelfClosing()) {
				if(tags.peek().isOpenTag()) {
					resolve.push(tags.peek());
					tags.remove();
				}else {
					if(resolve.isEmpty()&&!tags.isEmpty()) {
						return null;
					}
					if(resolve.peek().matches(tags.peek())) {
						resolve.pop();
						tags.remove();
					} else {
						return resolve;
					}
				}
			} else {
				tags.remove();
			}
		}
		
		
		/*System.out.println(tags);
		tags.remove();
		System.out.println(tags);*/
		return resolve; // this line is here only so this code will compile if you don't modify it
	}
	

}