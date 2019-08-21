package org.bahmni.module.bahmnicore.web.v1_0.controller;


import org.bahmni.module.obsrelationship.model.ObsRelationship;
import org.openmrs.module.bahmniemrapi.encountertransaction.contract.BahmniObservation;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.v1_0.controller.BaseRestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/rest/" + RestConstants.VERSION_1 + "/bahmnicore/drugorderrelationship")
public class DrugOrderRelationship extends BaseRestController {


    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public List<BahmniObservation> save(@RequestParam(value = "targetObsUuid", required = true) String targetObsUuid){


        return null;
    }



}
