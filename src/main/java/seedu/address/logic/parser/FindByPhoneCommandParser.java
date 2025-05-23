package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.Arrays;

import seedu.address.logic.commands.FindByPhoneCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.reservation.Phone;
import seedu.address.model.reservation.PhoneContainsKeywordsPredicate;

/**
 * Parses input arguments and creates a new FindByPhoneCommand object
 */
public class FindByPhoneCommandParser implements Parser<FindByPhoneCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the FindByPhoneCommand
     * and returns a FindByPhoneCommand object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public FindByPhoneCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, FindByPhoneCommand.MESSAGE_USAGE));
        }

        String[] phoneKeywords = trimmedArgs.split("\\s+");

        // check if phone number is valid
        for (String keyword : phoneKeywords) {
            if (!Phone.isValidPhone(keyword)) {
                throw new ParseException(Phone.MESSAGE_CONSTRAINTS);
            }
        }

        return new FindByPhoneCommand(new PhoneContainsKeywordsPredicate(Arrays.asList(phoneKeywords)));
    }
}
