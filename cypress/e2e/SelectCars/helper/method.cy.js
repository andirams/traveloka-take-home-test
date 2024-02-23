import {
    Locator
} from './locator.cy';

const locator = new Locator(); // diimport dari file locator.cy.js yg sebelumnya dibuat

export class Method {

    // memilih produk mobil pertama
    clickCarsProductButton() {
        cy.get(locator.selectCarProduct).eq(0).click();
    }

    // mengeklik button search car
    clickSearchCarButton() {
        cy.get(locator.btnSearchCar).click();
    }

    // mengeklik button continue product detail
    clickContinueButtonPD() {
        cy.get(locator.btnContinuePD).click();
    }

    // mengeklik button continue
    clickContinueButton() {
        cy.get(locator.btnContinue).click();
    }

    // mengeklik button Book Now
    clickBookNowButton() {
        cy.get(locator.btnBookNow).click();
    }

    // memilih tab without driver pada urutan pertama
    selectTabWithoutDriver(){
        cy.get(locator.selectTabWithoutDriver).select(0);
    }

    // memilih pick-up location (jakarta)
    selectPickUpLocation(){
        cy.get(locator.selectPickUpLoc).contains("Jakarta");
    }

    // memilih mobil pertama
    selectCar(){
        cy.get(locator.selectCar).select(0);
    }

    // memilih provider mobil pertama
    selectCarProvider(){
        cy.get(locator.selectCarProv).select(0);
    }

    // memilih pick-up location di "Rental Office"
    selectPickUpLocationRO(){
        cy.get(locator.selectPickUpLocRent).select(0);
    }

    // memilih drop-off location di "Other Location"
    selectDropOffLocationOL(){
        cy.get(locator.selectDropOffLocOth).select(0);
    }

    // memilih metode payment
    selectPaymentMethod(){
        cy.get(locator.selectPaymentMethod).select(0);
    }

    // mengisi pick-up date&time (today+2d 09:00)
    fillPickUpDateTime(){
        cy.get(locator.selectPickUpDate).click();
        var date = "25/02/2024";
        var time = "09:00";
        cy.get(locator.inputPickUpDate).type(date);
        cy.get(locator.inputPickUpDate).should('have.value', date);
        cy.get(locator.inputPickUpTime).type(time);
        cy.get(locator.inputPickUpTime).should('have.value', time);
    }

    // mengisi drop-off date&time (today+5d 11:00)
    fillDropOffDateTime(){
        cy.get(locator.selectDropOffDate).click();
        var date = "28/02/2024";
        var time = "11:00";
        cy.get(locator.inputDropOffDate).type(date);
        cy.get(locator.inputDropOffDate).should('have.value', date);
        cy.get(locator.inputDropOffTime).type(time);
        cy.get(locator.inputDropOffTime).should('have.value', time);
    }

    // mengisi pickup/dropoff notes
    fillNotesPorD(){
        var notes = "blablabla";
        cy.get(locator.inputNotes).type(notes);
        cy.get(locator.inputNotes).should('have.value', notes);
    }

    // mengisi contact detail
    fillContactDetails(){
        var contact = "blablabla";
        cy.get(locator.inputContactDetail).type(contact);
        cy.get(locator.inputContactDetail).should('have.value', contact);
    }

    // mengisi driver details
    fillDriverDetails(){
        var driver = "blablabla";
        cy.get(locator.inputDriverDetail).type(driver);
        cy.get(locator.inputDriverDetail).should('have.value', driver);
    }

    // mengisi special request
    fillSpecialRequest(){
        var req = "blablabla";
        cy.get(locator.inputSpecialReq).type(req);
        cy.get(locator.inputSpecialReq).should('have.value', req);
    }

    // cek semua kebutuhan rental
    validateAllRentalReq(){
        cy.get(locator.req1).should('be.checked');
        cy.get(locator.req2).should('be.checked');
        cy.get(locator.req3).should('be.checked');
        cy.get(locator.req4).should('be.checked');
    }

    // cek sudah terbayar
    validatePaymentSuccess(){
        cy.get(locator.paymentSuccess).should('be.visible');
    }

}