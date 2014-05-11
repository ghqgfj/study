package thread;

public abstract class Task {
	public enum State{
		NEW,RUNNING,DESTROYED;
	}
	private State state=State.NEW;
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public abstract void deal();
}
