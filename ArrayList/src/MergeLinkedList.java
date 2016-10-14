import java.util.LinkedList;
import java.util.ListIterator;

public class MergeLinkedList {

	public static void main(String[] args) {
		LinkedList<String> alpha = new LinkedList<String>();
		LinkedList<String> beta = new LinkedList<String>();

		alpha.add("ax");
		alpha.add("cm");
		alpha.add("ep");
		alpha.add("gl");

		beta.add("bm");
		beta.add("do");
		beta.add("fe");
		beta.add("ho");

		ListIterator<String> aI = alpha.listIterator();
		ListIterator<String> bI = beta.listIterator();

		while (bI.hasNext()) {
			if (aI.hasNext()) {
				aI.next();
			}
			aI.add(bI.next());
		}

		System.out.println(alpha);

		bI = beta.listIterator();
		while (bI.hasNext()) {
			bI.next();
			if (bI.hasNext()) {
				bI.next();
				bI.remove();
			}
		}

		System.out.println(beta);

		alpha.removeAll(beta);
		System.out.println(alpha);

	}

}
