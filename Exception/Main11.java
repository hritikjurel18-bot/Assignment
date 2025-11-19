class InvalidRatingException extends Exception {
    public InvalidRatingException(String m){ super(m); }
}

class EmptyReviewException extends Exception {
    public EmptyReviewException(String m){ super(m); }
}

public class Main11 {

    static void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {

        if(rating < 1 || rating > 5)
            throw new InvalidRatingException("Invalid rating");

        if(comment == null || comment.isEmpty())
            throw new EmptyReviewException("Empty comment");
    }

    public static void main(String[] args){
        try {
            submitReview(10, "Nice");
        }
        catch(InvalidRatingException e){
            System.out.println(e.getMessage());
        }
        catch(EmptyReviewException e){
            System.out.println(e.getMessage());
        }
    }
}
