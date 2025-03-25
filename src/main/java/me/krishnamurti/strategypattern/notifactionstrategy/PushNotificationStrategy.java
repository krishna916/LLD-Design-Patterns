package me.krishnamurti.strategypattern.notifactionstrategy;

public class PushNotificationStrategy implements NotificationStrategy
{
	@Override
	public void sendNotification(String message) {
		System.out.println("Sending push notification: " + message);
	}
}
