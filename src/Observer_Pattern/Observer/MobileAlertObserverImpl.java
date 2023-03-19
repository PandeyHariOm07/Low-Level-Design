package Observer_Pattern.Observer;

import Observer_Pattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
	
	String Mobile;
	StockObservable observable;
	public MobileAlertObserverImpl(String Mobile, StockObservable observable) {
		this.Mobile = Mobile;
		this.observable = observable;
	}
	@Override
	public void update() {
		sendMail(Mobile);
	}
	public void sendMail(String Mobile) {
		System.out.println("message send to " + Mobile);
	}

}
