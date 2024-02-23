import {
    Method
} from './method.cy';

const method = new Method();

export class Step {
    // TC-01 - Rent a car
    rentACar() {
        method.clickCarsProductButton();
        method.selectTabWithoutDriver();
        method.selectPickUpLocation();
        method.fillPickUpDateTime();
        method.fillDropOffDateTime();
        method.clickSearchCarButton();
        method.selectCar();
        method.selectCarProvider();
        method.clickContinueButtonPD();
        method.selectPickUpLocationRO();
        method.selectDropOffLocationOL();
        method.fillNotesPorD();
        method.clickBookNowButton();
        method.fillContactDetails();
        method.fillDriverDetails();
        method.clickContinueButton();
        method.fillSpecialRequest();
        method.validateAllRentalReq();
        method.clickContinueButton();
        method.selectPaymentMethod();
        method.validatePaymentSuccess();
    }
}