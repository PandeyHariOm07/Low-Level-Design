package Observer_Pattern;

import Observer_Pattern.Observable.IphoneObservableImpl;
import Observer_Pattern.Observable.StockObservable;
import Observer_Pattern.Observer.EmailAlertObserverImpl;
import Observer_Pattern.Observer.MobileAlertObserverImpl;
import Observer_Pattern.Observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		StockObservable iphoneStockObservable =  new IphoneObservableImpl();
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz3@gmail.com", iphoneStockObservable);
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStockCount(10);
	}

}
