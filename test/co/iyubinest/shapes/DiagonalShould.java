package co.iyubinest.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DiagonalShould {

  @Test
  public void be() {
    Assert.assertThat(
        Diagonal.create().value(),
        is(
            String.format(
                      "*    %n"
                    + " *   %n"
                    + "  *  %n"
                    + "   * %n"
                    + "    *"
            )
        )
    );
  }
}
