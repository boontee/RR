/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package riskregister.process;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.Response.Status;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jbpm.util.JsonSchemaUtil;
import org.kie.kogito.process.Process;
import org.kie.kogito.process.ProcessInstance;
import org.kie.kogito.process.ProcessService;
import org.kie.kogito.process.workitem.TaskModel;
import org.kie.kogito.auth.IdentityProviderFactory;
import org.kie.kogito.auth.SecurityPolicy;

@Path("/RiskRegisterProcess")
@org.eclipse.microprofile.openapi.annotations.tags.Tag(name = "RiskRegisterProcess")
@jakarta.enterprise.context.ApplicationScoped()
public class RiskRegisterProcessResource {

    @jakarta.inject.Inject()
    @jakarta.inject.Named("RiskRegisterProcess")
    Process<RiskRegisterProcessModel> process;

    @Inject
    ProcessService processService;

    @Inject
    IdentityProviderFactory identityProviderFactory;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "RiskRegisterProcess", description = "")
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Response createResource_RiskRegisterProcess(@Context HttpHeaders httpHeaders, @Context UriInfo uriInfo, @QueryParam("businessKey") @DefaultValue("") String businessKey, @jakarta.validation.Valid() @jakarta.validation.constraints.NotNull() RiskRegisterProcessModelInput resource) {
        ProcessInstance<RiskRegisterProcessModel> pi = processService.createProcessInstance(process, businessKey, Optional.ofNullable(resource).orElse(new RiskRegisterProcessModelInput()).toModel(), httpHeaders.getRequestHeaders(), httpHeaders.getHeaderString("X-KOGITO-StartFromNode"), null, httpHeaders.getHeaderString("X-KOGITO-ReferenceId"), null);
        return Response.created(uriInfo.getAbsolutePathBuilder().path(pi.id()).build()).entity(pi.checkError().variables().toModel()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "RiskRegisterProcess", description = "")
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public List<RiskRegisterProcessModelOutput> getResources_RiskRegisterProcess() {
        return processService.getProcessInstanceOutput(process);
    }

    @GET
    @Path("schema")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "RiskRegisterProcess", description = "")
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getResourceSchema_RiskRegisterProcess() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id());
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "RiskRegisterProcess", description = "")
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput getResource_RiskRegisterProcess(@PathParam("id") String id) {
        return processService.findById(process, id).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "RiskRegisterProcess", description = "")
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput deleteResource_RiskRegisterProcess(@PathParam("id") final String id) {
        return processService.delete(process, id).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "RiskRegisterProcess", description = "")
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput updateModel_RiskRegisterProcess(@PathParam("id") String id, @jakarta.validation.Valid() @jakarta.validation.constraints.NotNull() RiskRegisterProcessModelInput resource) {
        return processService.update(process, id, resource.toModel()).orElseThrow(NotFoundException::new);
    }

    @PATCH
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "RiskRegisterProcess", description = "")
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput updateModelPartial_RiskRegisterProcess(@PathParam("id") String id, @jakarta.validation.Valid() @jakarta.validation.constraints.NotNull() RiskRegisterProcessModelInput resource) {
        return processService.updatePartial(process, id, resource.toModel()).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/tasks")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "RiskRegisterProcess", description = "")
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public List<TaskModel> getTasks_RiskRegisterProcess(@PathParam("id") String id, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItems(process, id, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups))).orElseThrow(NotFoundException::new).stream().map(riskregister.process.RiskRegisterProcess_TaskModelFactory::from).collect(Collectors.toList());
    }

    @POST
    @Path("/{id}/SROSubmitRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput completeTask_SROSubmitRR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/SROSubmitRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput saveTask_SROSubmitRR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, riskregister.process.RiskRegisterProcess__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/SROSubmitRR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput taskTransition_SROSubmitRR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/SROSubmitRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskModel getWorkItem_SROSubmitRR_0(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), riskregister.process.RiskRegisterProcess__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/SROSubmitRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput abortTask_SROSubmitRR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("SROSubmitRR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchema_SROSubmitRR_0() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "SROSubmitRR");
    }

    @GET
    @Path("/{id}/SROSubmitRR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchemaAndPhases_SROSubmitRR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "SROSubmitRR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/HODApprove/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput completeTask_HODApprove_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/HODApprove/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput saveTask_HODApprove_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/HODApprove/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput taskTransition_HODApprove_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/HODApprove/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel getWorkItem_HODApprove_1(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/HODApprove/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput abortTask_HODApprove_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("HODApprove/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchema_HODApprove_1() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "HODApprove");
    }

    @GET
    @Path("/{id}/HODApprove/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchemaAndPhases_HODApprove_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "HODApprove", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/RMD_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput completeTask_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/RMD_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput saveTask_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, riskregister.process.RiskRegisterProcess__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/RMD_Verify_RR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput taskTransition_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/RMD_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskModel getWorkItem_RMD_Verify_RR_2(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), riskregister.process.RiskRegisterProcess__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/RMD_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput abortTask_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("RMD_Verify_RR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchema_RMD_Verify_RR_2() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "RMD_Verify_RR");
    }

    @GET
    @Path("/{id}/RMD_Verify_RR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchemaAndPhases_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "RMD_Verify_RR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/MakerSubmitRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput completeTask_MakerSubmitRR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/MakerSubmitRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput saveTask_MakerSubmitRR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, riskregister.process.RiskRegisterProcess__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/MakerSubmitRR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput taskTransition_MakerSubmitRR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/MakerSubmitRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskModel getWorkItem_MakerSubmitRR_3(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), riskregister.process.RiskRegisterProcess__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/MakerSubmitRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput abortTask_MakerSubmitRR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("MakerSubmitRR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchema_MakerSubmitRR_3() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "MakerSubmitRR");
    }

    @GET
    @Path("/{id}/MakerSubmitRR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchemaAndPhases_MakerSubmitRR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "MakerSubmitRR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/DivHeadVerifyRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput completeTask_DivHeadVerifyRR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/DivHeadVerifyRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput saveTask_DivHeadVerifyRR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, riskregister.process.RiskRegisterProcess__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/DivHeadVerifyRR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput taskTransition_DivHeadVerifyRR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/DivHeadVerifyRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskModel getWorkItem_DivHeadVerifyRR_4(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), riskregister.process.RiskRegisterProcess__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/DivHeadVerifyRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput abortTask_DivHeadVerifyRR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("DivHeadVerifyRR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchema_DivHeadVerifyRR_4() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "DivHeadVerifyRR");
    }

    @GET
    @Path("/{id}/DivHeadVerifyRR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchemaAndPhases_DivHeadVerifyRR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "DivHeadVerifyRR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/JROVerifyRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput completeTask_JROVerifyRR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/JROVerifyRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput saveTask_JROVerifyRR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, riskregister.process.RiskRegisterProcess__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/JROVerifyRR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput taskTransition_JROVerifyRR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/JROVerifyRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskModel getWorkItem_JROVerifyRR_5(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), riskregister.process.RiskRegisterProcess__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/JROVerifyRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput abortTask_JROVerifyRR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("JROVerifyRR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchema_JROVerifyRR_5() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "JROVerifyRR");
    }

    @GET
    @Path("/{id}/JROVerifyRR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchemaAndPhases_JROVerifyRR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "JROVerifyRR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/HODVerifyRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput completeTask_HODVerifyRR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/HODVerifyRR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput saveTask_HODVerifyRR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, riskregister.process.RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/HODVerifyRR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput taskTransition_HODVerifyRR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final riskregister.process.RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/HODVerifyRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public riskregister.process.RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskModel getWorkItem_HODVerifyRR_6(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), riskregister.process.RiskRegisterProcess__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/HODVerifyRR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public RiskRegisterProcessModelOutput abortTask_HODVerifyRR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("HODVerifyRR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchema_HODVerifyRR_6() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "HODVerifyRR");
    }

    @GET
    @Path("/{id}/HODVerifyRR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    @org.eclipse.microprofile.faulttolerance.Retry()
    public Map<String, Object> getSchemaAndPhases_HODVerifyRR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "HODVerifyRR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }
}
