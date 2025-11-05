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
package org.drools.bpmn2;

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

@Path("/_154F3348-0775-4F4C-B0F3-DD5B3F86F06C")
@org.eclipse.microprofile.openapi.annotations.tags.Tag(name = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C")
@jakarta.enterprise.context.ApplicationScoped()
public class _154F3348_0775_4F4C_B0F3_DD5B3F86F06CResource {

    @jakarta.inject.Inject()
    @jakarta.inject.Named("_154F3348-0775-4F4C-B0F3-DD5B3F86F06C")
    Process<_154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel> process;

    @Inject
    ProcessService processService;

    @Inject
    IdentityProviderFactory identityProviderFactory;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", description = "")
    @jakarta.transaction.Transactional()
    public Response createResource__154F3348_0775_4F4C_B0F3_DD5B3F86F06C(@Context HttpHeaders httpHeaders, @Context UriInfo uriInfo, @QueryParam("businessKey") @DefaultValue("") String businessKey, @jakarta.validation.Valid() @jakarta.validation.constraints.NotNull() _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelInput resource) {
        ProcessInstance<_154F3348_0775_4F4C_B0F3_DD5B3F86F06CModel> pi = processService.createProcessInstance(process, businessKey, Optional.ofNullable(resource).orElse(new _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelInput()).toModel(), httpHeaders.getRequestHeaders(), httpHeaders.getHeaderString("X-KOGITO-StartFromNode"), null, httpHeaders.getHeaderString("X-KOGITO-ReferenceId"), null);
        return Response.created(uriInfo.getAbsolutePathBuilder().path(pi.id()).build()).entity(pi.checkError().variables().toModel()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", description = "")
    @jakarta.transaction.Transactional()
    public List<_154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput> getResources__154F3348_0775_4F4C_B0F3_DD5B3F86F06C() {
        return processService.getProcessInstanceOutput(process);
    }

    @GET
    @Path("schema")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", description = "")
    @jakarta.transaction.Transactional()
    public Map<String, Object> getResourceSchema__154F3348_0775_4F4C_B0F3_DD5B3F86F06C() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id());
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", description = "")
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput getResource__154F3348_0775_4F4C_B0F3_DD5B3F86F06C(@PathParam("id") String id) {
        return processService.findById(process, id).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", description = "")
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput deleteResource__154F3348_0775_4F4C_B0F3_DD5B3F86F06C(@PathParam("id") final String id) {
        return processService.delete(process, id).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", description = "")
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput updateModel__154F3348_0775_4F4C_B0F3_DD5B3F86F06C(@PathParam("id") String id, @jakarta.validation.Valid() @jakarta.validation.constraints.NotNull() _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelInput resource) {
        return processService.update(process, id, resource.toModel()).orElseThrow(NotFoundException::new);
    }

    @PATCH
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", description = "")
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput updateModelPartial__154F3348_0775_4F4C_B0F3_DD5B3F86F06C(@PathParam("id") String id, @jakarta.validation.Valid() @jakarta.validation.constraints.NotNull() _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelInput resource) {
        return processService.updatePartial(process, id, resource.toModel()).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/tasks")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "_154F3348-0775-4F4C-B0F3-DD5B3F86F06C", description = "")
    @jakarta.transaction.Transactional()
    public List<TaskModel> getTasks__154F3348_0775_4F4C_B0F3_DD5B3F86F06C(@PathParam("id") String id, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItems(process, id, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups))).orElseThrow(NotFoundException::new).stream().map(org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C_TaskModelFactory::from).collect(Collectors.toList());
    }

    @POST
    @Path("/{id}/SRO_Submit_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput completeTask_SRO_Submit_RR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/SRO_Submit_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput saveTask_SRO_Submit_RR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/SRO_Submit_RR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput taskTransition_SRO_Submit_RR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/SRO_Submit_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskModel getWorkItem_SRO_Submit_RR_0(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__1C18E257_48C8_4832_91D9_C1FCC57190C5_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/SRO_Submit_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput abortTask_SRO_Submit_RR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("SRO_Submit_RR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchema_SRO_Submit_RR_0() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "SRO_Submit_RR");
    }

    @GET
    @Path("/{id}/SRO_Submit_RR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchemaAndPhases_SRO_Submit_RR_0(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "SRO_Submit_RR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/HOD_Approve/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput completeTask_HOD_Approve_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/HOD_Approve/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput saveTask_HOD_Approve_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/HOD_Approve/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput taskTransition_HOD_Approve_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/HOD_Approve/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel getWorkItem_HOD_Approve_1(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/HOD_Approve/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput abortTask_HOD_Approve_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("HOD_Approve/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchema_HOD_Approve_1() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "HOD_Approve");
    }

    @GET
    @Path("/{id}/HOD_Approve/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchemaAndPhases_HOD_Approve_1(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "HOD_Approve", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/RMD_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput completeTask_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/RMD_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput saveTask_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/RMD_Verify_RR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput taskTransition_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/RMD_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskModel getWorkItem_RMD_Verify_RR_2(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/RMD_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput abortTask_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("RMD_Verify_RR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchema_RMD_Verify_RR_2() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "RMD_Verify_RR");
    }

    @GET
    @Path("/{id}/RMD_Verify_RR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchemaAndPhases_RMD_Verify_RR_2(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "RMD_Verify_RR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/Maker_Submit_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput completeTask_Maker_Submit_RR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/Maker_Submit_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput saveTask_Maker_Submit_RR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/Maker_Submit_RR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput taskTransition_Maker_Submit_RR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/Maker_Submit_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskModel getWorkItem_Maker_Submit_RR_3(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DB6511C3_530F_4D9B_B789_1D8DC62AEE70_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/Maker_Submit_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput abortTask_Maker_Submit_RR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("Maker_Submit_RR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchema_Maker_Submit_RR_3() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "Maker_Submit_RR");
    }

    @GET
    @Path("/{id}/Maker_Submit_RR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchemaAndPhases_Maker_Submit_RR_3(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "Maker_Submit_RR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/Div_Head_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput completeTask_Div_Head_Verify_RR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/Div_Head_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput saveTask_Div_Head_Verify_RR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/Div_Head_Verify_RR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput taskTransition_Div_Head_Verify_RR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/Div_Head_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskModel getWorkItem_Div_Head_Verify_RR_4(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__DE0A504F_8E6A_4BD7_8000_5DFFF2191422_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/Div_Head_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput abortTask_Div_Head_Verify_RR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("Div_Head_Verify_RR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchema_Div_Head_Verify_RR_4() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "Div_Head_Verify_RR");
    }

    @GET
    @Path("/{id}/Div_Head_Verify_RR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchemaAndPhases_Div_Head_Verify_RR_4(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "Div_Head_Verify_RR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/JRO_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput completeTask_JRO_Verify_RR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/JRO_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput saveTask_JRO_Verify_RR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/JRO_Verify_RR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput taskTransition_JRO_Verify_RR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/JRO_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskModel getWorkItem_JRO_Verify_RR_5(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__E82B11A3_F055_4091_AB9E_6869B67ACE6E_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/JRO_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput abortTask_JRO_Verify_RR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("JRO_Verify_RR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchema_JRO_Verify_RR_5() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "JRO_Verify_RR");
    }

    @GET
    @Path("/{id}/JRO_Verify_RR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchemaAndPhases_JRO_Verify_RR_5(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "JRO_Verify_RR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }

    @POST
    @Path("/{id}/HOD_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput completeTask_HOD_Verify_RR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("complete") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @PUT
    @Path("/{id}/HOD_Verify_RR/{taskId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput saveTask_HOD_Verify_RR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput model) {
        return processService.setWorkItemOutput(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model, org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput::fromMap).orElseThrow(NotFoundException::new);
    }

    @POST
    @Path("/{id}/HOD_Verify_RR/{taskId}/phases/{phase}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput taskTransition_HOD_Verify_RR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @PathParam("phase") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups, final org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskOutput model) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), model).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("/{id}/HOD_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskModel getWorkItem_HOD_Verify_RR_6(@PathParam("id") String id, @PathParam("taskId") String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItem(process, id, taskId, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), org.drools.bpmn2._154F3348_0775_4F4C_B0F3_DD5B3F86F06C__D4D21E2A_9D22_4A2E_80DB_7E70D1232116_TaskModel::from).orElseThrow(NotFoundException::new);
    }

    @DELETE
    @Path("/{id}/HOD_Verify_RR/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public _154F3348_0775_4F4C_B0F3_DD5B3F86F06CModelOutput abortTask_HOD_Verify_RR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("phase") @DefaultValue("abort") final String phase, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.transitionWorkItem(process, id, taskId, phase, SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)), null).orElseThrow(NotFoundException::new);
    }

    @GET
    @Path("HOD_Verify_RR/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchema_HOD_Verify_RR_6() {
        return JsonSchemaUtil.load(this.getClass().getClassLoader(), process.id(), "HOD_Verify_RR");
    }

    @GET
    @Path("/{id}/HOD_Verify_RR/{taskId}/schema")
    @Produces(MediaType.APPLICATION_JSON)
    @jakarta.transaction.Transactional()
    public Map<String, Object> getSchemaAndPhases_HOD_Verify_RR_6(@PathParam("id") final String id, @PathParam("taskId") final String taskId, @QueryParam("user") final String user, @QueryParam("group") final List<String> groups) {
        return processService.getWorkItemSchemaAndPhases(process, id, taskId, "HOD_Verify_RR", SecurityPolicy.of(identityProviderFactory.getOrImpersonateIdentity(user, groups)));
    }
}
