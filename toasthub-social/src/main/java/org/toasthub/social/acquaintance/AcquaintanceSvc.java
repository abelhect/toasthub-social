package org.toasthub.social.acquaintance;

import org.toasthub.core.general.model.RestRequest;
import org.toasthub.core.general.model.RestResponse;

public interface AcquaintanceSvc {

	public void process(RestRequest request, RestResponse response);
}
