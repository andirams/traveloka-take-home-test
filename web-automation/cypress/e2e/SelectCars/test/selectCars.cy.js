import {
    Step
} from '../helper/step.cy';

const step = new Step();

describe('Select Cars', () => {
    beforeEach(() => {
        cy.viewport(1920, 1080);
        // mengunjungi url
        cy.visit('/');
    });

    it('TC-01 - Rent a car', () => {
        // memanggil step rentACar dari file step.cy.js
        step.rentACar();
    });

});