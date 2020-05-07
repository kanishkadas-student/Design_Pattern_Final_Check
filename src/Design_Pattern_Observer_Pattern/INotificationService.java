package Design_Pattern_Observer_Pattern;

public interface INotificationService {

	public void addObserver(INotificationObserver observer);
	public void removeObserver(INotificationObserver observer);
	public void notifyObserver();
}
