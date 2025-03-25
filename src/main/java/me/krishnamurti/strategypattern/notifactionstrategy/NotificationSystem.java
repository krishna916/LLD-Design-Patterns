package me.krishnamurti.strategypattern.notifactionstrategy;

public class NotificationSystem
{
	public static void main(String[] args)
	{
		NotificationService notificationService = new NotificationService(new EmailNotificationStrategy());
		notificationService.sendNotification("Hello, this is an email notification.");

		notificationService.setStrategy(new SMSNotificationStrategy());
		notificationService.sendNotification("Hello, this is an SMS notification.");

		notificationService.setStrategy(new PushNotificationStrategy());
		notificationService.sendNotification("Hello, this is a push notification.");
	}
}
