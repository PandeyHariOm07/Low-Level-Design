package Observer_Pattern.Observable;

import Observer_Pattern.Observer.NotificationAlertObserver;
import java.util.*;

public class IphoneObservableImpl implements StockObservable {
	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount=0;

	@Override
	public void add(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
		
	}

	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for(NotificationAlertObserver observer : observerList) {
			observer.update();
		}
		
	}

	@Override
	public void setStockCount(int newStockAdded) {
		// TODO Auto-generated method stub
		if(stockCount ==0) {
			notifySubscribers();
		}
		stockCount += newStockAdded;
		}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return stockCount;
	}

}
