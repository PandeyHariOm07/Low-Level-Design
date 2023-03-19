package Observer_Pattern.Observer;

import Observer_Pattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
	String emailIds;
	StockObservable observable;
	public EmailAlertObserverImpl(String emailId, StockObservable observable) {
		this.observable = observable;
		this.emailIds = emailId;
	}
	@Override
	public void update() {
		sendMail(emailIds);
	}
	public void sendMail(String emailld) {
		System.out.println("mail send to " + emailIds);
	}


}
