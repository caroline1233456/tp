package seedu.address.logic.commands;

import static seedu.address.testutil.TypicalReservations.getTypicalAddressBook;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) and unit tests for EditCommand.
 */
public class EditCommandTest {


    private Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    // TODO ReservationBuilder is no longer default after merging
    // Need to update by next milestone

    //    @Test
    //    public void execute_allFieldsSpecifiedUnfilteredList_success() {
    //        Reservation editedReservation = new ReservationBuilder().build1();
    //        EditCommand.EditReservationDescriptor descriptor = new EditReservationDescriptorBuilder(
    //                editedReservation).build();
    //        EditCommand editCommand = new EditCommand(ID_AMY, descriptor);
    //
    //        String expectedMessage = String.format(
    //                EditCommand.MESSAGE_EDIT_RESERVATION_SUCCESS,
    //                Messages.format(editedReservation));
    //
    //        Model expectedModel = new ModelManager(new AddressBook(model.getAddressBook()), new UserPrefs());
    //        expectedModel.setReservation(model.getFilteredReservationList().get(0), editedReservation);
    //
    //        assertCommandSuccess(editCommand, model, expectedMessage, expectedModel);
    //    }
    //
    //    @Test
    //    public void execute_someFieldsSpecifiedUnfilteredList_success() {
    //        Reservation lastReservation = model.getFilteredReservationList().get(1);
    //
    //        ReservationBuilder personInList = new ReservationBuilder(lastReservation);
    //        Reservation editedReservation = personInList.withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
    //                .withTags(VALID_TAG_HUSBAND).build2();
    //
    //        EditCommand.EditReservationDescriptor descriptor =
    //                new EditReservationDescriptorBuilder().withName(VALID_NAME_BOB)
    //                .withPhone(VALID_PHONE_BOB).withTags(VALID_TAG_HUSBAND).build();
    //
    //        descriptor.setId(lastReservation.getId());
    //
    //        EditCommand editCommand = new EditCommand(new Identification(VALID_ID_BOB), descriptor);
    //
    //        String expectedMessage = String.format(EditCommand.MESSAGE_EDIT_RESERVATION_SUCCESS,
    //                Messages.format(editedReservation));
    //
    //        Model expectedModel = new ModelManager(new AddressBook(model.getAddressBook()), new UserPrefs());
    //        expectedModel.setReservation(lastReservation, editedReservation);
    //
    //        assertCommandSuccess(editCommand, model, expectedMessage, expectedModel);
    //    }
    //
    //    @Test
    //    public void execute_noFieldSpecifiedUnfilteredList_success() {
    //        EditCommand editCommand = new EditCommand(new Identification(VALID_ID_BOB),
    //                new EditCommand.EditReservationDescriptor());
    //        Reservation editedReservation = model.getFilteredReservationList().get(1);
    //
    //        String expectedMessage = String.format(EditCommand.MESSAGE_EDIT_RESERVATION_SUCCESS,
    //                Messages.format(editedReservation));
    //
    //        Model expectedModel = new ModelManager(new AddressBook(model.getAddressBook()), new UserPrefs());
    //
    //        assertCommandSuccess(editCommand, model, expectedMessage, expectedModel);
    //    }
    //
    //    @Test
    //    public void execute_filteredList_success() {
    //        //  showPersonAtIndex(model, INDEX_FIRST_PERSON);
    //
    //        Reservation reservationInFilteredList = model.getFilteredReservationList()
    //                .get(1);
    //        Reservation editedReservation = new ReservationBuilder(reservationInFilteredList)
    //                .withName(VALID_NAME_BOB).build2();
    //        EditCommand editCommand = new EditCommand(new Identification(VALID_ID_BOB),
    //                new EditReservationDescriptorBuilder().withName(VALID_NAME_BOB).build());
    //
    //        String expectedMessage = String.format(EditCommand.MESSAGE_EDIT_RESERVATION_SUCCESS,
    //                Messages.format(editedReservation));
    //
    //        Model expectedModel = new ModelManager(new AddressBook(model.getAddressBook()), new UserPrefs());
    //        expectedModel.setReservation(model.getFilteredReservationList().get(1), editedReservation);
    //
    //        assertCommandSuccess(editCommand, model, expectedMessage, expectedModel);
    //    }

    // To be updated during next milestone
    //    @Test
    //    public void execute_duplicatePersonUnfilteredList_failure() {
    //        Reservation firstReservation = model.getFilteredReservationList().get(1);
    //        EditCommand.EditReservationDescriptor descriptor =
    //                new EditReservationDescriptorBuilder(firstReservation).build();
    //        EditCommand editCommand = new EditCommand(new Identification(VALID_ID_BOB), descriptor);
    //
    //        assertCommandFailure(editCommand, model, EditCommand.MESSAGE_DUPLICATE_RESERVATION);
    //    }
    //
    //    @Test
    //    public void execute_duplicatePersonFilteredList_failure() {
    //        showPersonAtIndex(model, INDEX_FIRST_PERSON);
    //
    //        // edit person in filtered list into a duplicate in address book
    //        Reservation reservationInList = model.getAddressBook().getReservationList()
    //        .get(INDEX_SECOND_PERSON.getZeroBased());
    //        EditCommand editCommand = new EditCommand(INDEX_FIRST_PERSON,
    //                new EditReservationDescriptorBuilder(reservationInList).build());
    //
    //        assertCommandFailure(editCommand, model, EditCommand.MESSAGE_DUPLICATE_RESERVATION);
    //    }
    //
    //    @Test
    //    public void execute_invalidPersonIndexUnfilteredList_failure() {
    //        Index outOfBoundIndex = Index.fromOneBased(model.getFilteredReservationList().size() + 1);
    //        EditReservationDescriptor descriptor = new EditReservationDescriptorBuilder()
    //        .withName(VALID_NAME_BOB).build();
    //        EditCommand editCommand = new EditCommand(outOfBoundIndex, descriptor);
    //
    //        assertCommandFailure(editCommand, model, Messages.MESSAGE_INVALID_RESERVATION_DISPLAYED_INDEX);
    //    }
    //
    //
    //    @Test
    //    public void execute_invalidPersonIndexFilteredList_failure() {
    //        showPersonAtIndex(model, INDEX_FIRST_PERSON);
    //        Index outOfBoundIndex = INDEX_SECOND_PERSON;
    //        // ensures that outOfBoundIndex is still in bounds of address book list
    //        assertTrue(outOfBoundIndex.getZeroBased() < model.getAddressBook().getReservationList().size());
    //
    //        EditCommand editCommand = new EditCommand(outOfBoundIndex,
    //                new EditReservationDescriptorBuilder().withName(VALID_NAME_BOB).build());
    //
    //        assertCommandFailure(editCommand, model, Messages.MESSAGE_INVALID_RESERVATION_DISPLAYED_INDEX);
    //    }
    //
    //    @Test
    //    public void equals() {
    //        final EditCommand standardCommand = new EditCommand(INDEX_FIRST_PERSON, DESC_AMY);
    //
    //        // same values -> returns true
    //        EditCommand.EditReservationDescriptor copyDescriptor = new EditReservationDescriptor(DESC_AMY);
    //        EditCommand commandWithSameValues = new EditCommand(INDEX_FIRST_PERSON, copyDescriptor);
    //        assertTrue(standardCommand.equals(commandWithSameValues));
    //
    //        // same object -> returns true
    //        assertTrue(standardCommand.equals(standardCommand));
    //
    //        // null -> returns false
    //        assertFalse(standardCommand.equals(null));
    //
    //        // different types -> returns false
    //        assertFalse(standardCommand.equals(new ClearCommand()));
    //
    //        // different index -> returns false
    //        assertFalse(standardCommand.equals(new EditCommand(INDEX_SECOND_PERSON, DESC_AMY)));
    //
    //        // different descriptor -> returns false
    //        assertFalse(standardCommand.equals(new EditCommand(INDEX_FIRST_PERSON, DESC_BOB)));
    //    }
    //
    //    @Test
    //    public void toStringMethod() {
    //        Index index = Index.fromOneBased(1);
    //        EditReservationDescriptor editReservationDescriptor = new EditReservationDescriptor();
    //        EditCommand editCommand = new EditCommand(index, editReservationDescriptor);
    //        String expected = EditCommand.class.getCanonicalName() + "{index=" + index + ", editPersonDescriptor="
    //                + editReservationDescriptor + "}";
    //        assertEquals(expected, editCommand.toString());
    //    }

}
