package de.saxessag.patrick;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
public class MainView extends VerticalLayout implements RouterLayout {

    private final Div childWrapper = new Div();

    public MainView() {

        setSizeFull();

        final HorizontalLayout appLayout = new HorizontalLayout();
        appLayout.setJustifyContentMode(JustifyContentMode.START);

        final VerticalLayout menuBar = new VerticalLayout();

        menuBar.add(new RouterLink(GreetView.TITLE, GreetView.class));
        menuBar.add(new RouterLink(RichTextEditorsView.TITLE, RichTextEditorsView.class));

        appLayout.add(menuBar, childWrapper);
        add(appLayout);
    }

    @Override
    public void showRouterLayoutContent(HasElement content) {
        childWrapper.getElement().appendChild(content.getElement());
    }
}
