package com.example.vaadin7theme;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import com.vaadin.ui.themes.ChameleonTheme;

@SuppressWarnings("serial")
@Theme("liu-chameleon")
public class Vaadin7themeUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponent(button);
		
		
		
		Button btn = new Button("Style me");
		btn.addStyleName(ChameleonTheme.BUTTON_BIG);
		//btn.addStyleName(ChameleonTheme.BUTTON_WIDE);
		btn.addStyleName(ChameleonTheme.BUTTON_DEFAULT);
		
        layout.addComponent(btn);
	}

}