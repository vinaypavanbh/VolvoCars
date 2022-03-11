package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    VolvoHomePage VolvoCarHomePage;

    @Step("Open the VolvoCar home page")
    public void VolvoCarHomePage() {
        VolvoCarHomePage.open();
    }
}
