import java.util.ArrayList;

public class CompositeUntersuchung extends Component{
	private ArrayList<Component> childs = new ArrayList<>();

	@Override
	public void operation() {
		System.out.println("Untersuchung wird durchgefuehrt");
	}

	@Override
	public int getPrize() {
		int sum = 0;
		for (int i = 0; i < childs.size(); i++) {
			sum += childs.get(i).getPrize();
		}
		return sum;
	}
	
	public void add(Component c) {
		childs.add(c);
	}
	
	public void remove(int pos) throws IndexOutOfBoundsException{
		childs.remove(pos);
	}
	
	public Component getChild( int pos ) throws IndexOutOfBoundsException {
		return childs.get(pos);
	}
	
	public int getChildsSize() {
		return childs.size();
	}

}
