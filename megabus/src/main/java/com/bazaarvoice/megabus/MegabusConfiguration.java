package com.bazaarvoice.megabus;

import com.bazaarvoice.emodb.kafka.Topic;
import com.bazaarvoice.megabus.refproducer.MegabusRefProducerConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class MegabusConfiguration {

    @Valid
    @NotNull
    @JsonProperty("applicationId")
    private String _applicationId;

    @Valid
    @NotNull
    @JsonProperty("megabusRefTopic")
    private Topic _megabusRefTopic;

    @Valid
    @NotNull
    @JsonProperty("megabusTopic")
    private Topic _megabusTopic;

    @Valid
    @NotNull
    @JsonProperty("missingRefTopic")
    private Topic _missingRefTopic;

    @Valid
    @NotNull
    @JsonProperty("retryRefTopic")
    private Topic _retryRefTopic;

    @Valid
    @NotNull
    @JsonProperty("refResolverConsumerGroupName")
    private String _refResolverConsumerGroupName;

    @Valid
    @NotNull
    @JsonProperty("delayProcessorConsumerGroupName")
    private String _delayProcessorConsumerGroupName;

    @Valid
    @NotNull
    @JsonProperty("boot")
    private MegabusBootConfiguration _bootConfiguration;

    @Valid
    @NotNull
    @JsonProperty("refProducer")
    private MegabusRefProducerConfiguration _refProducerConfiguration;

    public String getApplicationId() {
        return _applicationId;
    }

    public Topic getMegabusRefTopic() {
        return _megabusRefTopic;
    }

    public Topic getMegabusTopic() {
        return _megabusTopic;
    }

    public MegabusBootConfiguration getBootConfiguration() {
        return _bootConfiguration;
    }

    public MegabusRefProducerConfiguration getRefProducerConfiguration() {
        return _refProducerConfiguration;
    }

    public Topic getMissingRefTopic() {
        return _missingRefTopic;
    }

    public Topic getRetryRefTopic() {
        return _retryRefTopic;
    }

    public String getRefResolverConsumerGroupName() {
        return _refResolverConsumerGroupName;
    }

    public String getDelayProcessorConsumerGroupName() {
        return _delayProcessorConsumerGroupName;
    }
}
