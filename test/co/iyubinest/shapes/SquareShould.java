package co.iyubinest.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SquareShould {

  @Test
  public void be() {
    Assert.assertThat(
        Square.create().value(),
        is(
            String.format(
                      "***%n"
                    + "***%n"
                    + "***"
            )
        )
    );
  }
}
