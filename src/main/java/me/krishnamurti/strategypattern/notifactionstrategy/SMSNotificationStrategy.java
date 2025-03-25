package me.krishnamurti.strategypattern.notifactionstrategy;

public class SMSNotificationStrategy implements NotificationStrategy
{
	@Override
	public void sendNotification(String message) {
		System.out.println("Sending SMS: " + message);
	}
}
