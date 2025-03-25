package me.krishnamurti.strategypattern.notifactionstrategy;

public class EmailNotificationStrategy implements NotificationStrategy
{
	@Override
	public void sendNotification(String message) {
		System.out.println("Sending email: " + message);
	}
}
