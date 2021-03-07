package what.requiredclasses;

public class TokenNumberNote {
    //gives token number for registered people
    private int TokenNumber;

    public TokenNumberNote(int tokenNumber) {
        TokenNumber = tokenNumber;
    }

    public int getTokenNumber() {
        return TokenNumber;
    }

    public void setTokenNumber(int tokenNumber) {
        TokenNumber = tokenNumber;
    }
}
