package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileApp;
import com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;
import java.util.HashSet;
import java.util.Set;

public class TaxiMobileListView extends TaxiMobileListView_Roo_Gwt {

    private static com.puglieseweb.test.trms.client.managed.ui.TaxiMobileListView instance;

    public TaxiMobileListView() {
        super("New Taxi", new CellRenderer());
        init();
    }

    public static com.puglieseweb.test.trms.client.managed.ui.TaxiMobileListView instance() {
        if (instance == null) {
            instance = new TaxiMobileListView();
        }
        return instance;
    }

    public String[] getPaths() {
        return paths.toArray(new String[paths.size()]);
    }

    private static class CellRenderer extends AbstractSafeHtmlRenderer<TaxiProxy> {

        private final String dateStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().dateProp();

        private final String secondaryStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().secondaryProp();

        private final Renderer<Long> primaryRenderer = new AbstractRenderer<Long>() {

            public String render(java.lang.Long obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        private final Renderer<Integer> secondaryRenderer = new AbstractRenderer<Integer>() {

            public String render(java.lang.Integer obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        @Override
        public SafeHtml render(TaxiProxy value) {
            if (value == null) {
                return SafeHtmlUtils.EMPTY_SAFE_HTML;
            }
            SafeHtmlBuilder sb = new SafeHtmlBuilder();
            if (value.getId() != null) {
                sb.appendEscaped(primaryRenderer.render(value.getId()));
            }
            sb.appendHtmlConstant("<div style=\"position:relative;\">");
            sb.appendHtmlConstant("<div class=\"" + secondaryStyle + "\">");
            if (value.getVersion() != null) {
                sb.appendEscaped(secondaryRenderer.render(value.getVersion()));
            }
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("<div class=\"" + dateStyle + "\">");
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("</div>");
            return sb.toSafeHtml();
        }
    }
}
