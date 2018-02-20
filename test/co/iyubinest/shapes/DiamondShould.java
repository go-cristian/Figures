package co.iyubinest.shapes;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DiamondShould {

  @Test
  public void be() {
    Assert.assertThat(
        Diamond.create().value(),
        is(
            String.format(
                      "  *  %n"
                    + " *** %n"
                    + "*****%n"
                    + " *** %n"
                    + "  *  "
            )
        )
    );
  }
}
