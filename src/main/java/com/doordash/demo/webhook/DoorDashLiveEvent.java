package com.doordash.demo.webhook;

import lombok.Data;

import java.util.Date;

@Data
public class DoorDashLiveEvent {
    private String cancellationReason;
    private String cancellationReasonMessage;
    private boolean contactless;
    private Date createdAt;
    private String currency;
    private int dasherId;
    private String dasherName;
    private String dasherDropoffPhoneNumber;
    private String dasherPickupPhoneNumber;
    private Location dasherLocation;
    private String dasherVehicleMake;
    private String dasherVehicleModel;
    private String dasherVehicleYear;
    private String dropoffAddress;
    private String dropoffContactFamilyName;
    private String dropoffContactGivenName;
    private boolean dropoffContactSendNotifications;
    private String dropoffInstructions;
    private String dropoffPhoneNumber;
    private Date dropoffTimeActual;
    private Date dropoffTimeEstimated;
    private String dropoffVerificationImageUrl;
    private String dropoffSignatureImageUrl;
    private String eventName;
    private String externalDeliveryId;
    private int fee;
    private double orderValue;
    private String pickupAddress;
    private String pickupInstructions;
    private String pickupPhoneNumber;
    private String pickupReferenceTag;
    private String pickupExternalBusinessId;
    private String pickupExternalStoreId;
    private Date updatedAt;
    private Date pickupTimeActual;
    private Date pickupTimeEstimated;
    private String pickupVerificationImageUrl;
    private String returnAddress;
    private Date returnTimeActual;
    private Date returnTimeEstimated;
    private String supportReference;
    private int tip;
    private String trackingUrl;
}
