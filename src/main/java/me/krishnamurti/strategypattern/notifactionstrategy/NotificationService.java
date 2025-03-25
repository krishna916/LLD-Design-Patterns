package me.krishnamurti.strategypattern.notifactionstrategy;

public class NotificationService
{
	private NotificationStrategy strategy;

	public NotificationService(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	public void sendNotification(String message) {
		strategy.sendNotification(message);
	}
}
