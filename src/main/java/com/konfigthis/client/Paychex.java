package com.konfigthis.client;

import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.CompanyApi;
import com.konfigthis.client.api.ManagementApi;
import com.konfigthis.client.api.PayrollApi;
import com.konfigthis.client.api.WebhooksApi;
import com.konfigthis.client.api.WorkerApi;

public class Paychex {
    private ApiClient apiClient;
    public final AuthenticationApi authentication;
    public final CompanyApi company;
    public final ManagementApi management;
    public final PayrollApi payroll;
    public final WebhooksApi webhooks;
    public final WorkerApi worker;

    public Paychex() {
        this(null);
    }

    public Paychex(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.company = new CompanyApi(this.apiClient);
        this.management = new ManagementApi(this.apiClient);
        this.payroll = new PayrollApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
        this.worker = new WorkerApi(this.apiClient);
    }

}
