
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<script src='/webjars/AdminLTE/2.4.2/bower_components/jquery/dist/jquery.min.js'></script>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
<!-- Main content -->
<section class="content">    
    <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Formulario de Registro</h3>
            </div>
    <c:url var="urlsave" value="${pageContext.request.contextPath}/${urlAccion}" />
    <frm:form modelAttribute="modeloDpago" method="post" action="${urlsave}" class="form-horizontal" >
  
            <div class="box-body">
                <div class="form-group">
                    <frm:hidden path="idPago" />
                    <frm:label path="idPersona" class="col-sm-2 control-label" >id persona</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="idPersona" class="form-control" />
                    </div>
                </div>
                    <div class="form-group">
                    
                    <frm:label path="pago_total" class="col-sm-2 control-label" >pago total</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="pago_total" class="form-control" />
                    </div>
                    
                </div>
               <div class="form-group">
                    
                    <frm:label path="descuentos" class="col-sm-2 control-label" >descuentos</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="descuentos" class="form-control" />
                    </div>
                    
                </div>
                
              </div>
              <!-- /.box-body -->

                        
              <div class="box-footer" style="margin-left: 80px">                
                  <input type="submit" value="Guardar" class="btn btn-primary" />
                  
                  &nbsp;&nbsp;
                  <a href="${pageContext.request.contextPath}/estudianteMain" class="btn btn-primary">Cancelar</a> 
              </div>            
    </frm:form>
</div>

</section> 
<script type="text/javascript">
    $(function () {
       //$('#datetimepicker1').datetimepicker();
    $('#datepicker').datepicker({        
        //format: 'dd-MMM-yyyy'
        format: 'yyyy/mm/dd'
    }); 

        var dato=$('#datepicker').val();
        var dato2=dato.replace('-','/')
        
        $('#datepicker').val(dato2.replace('-','/'));
        //alert(dato2.replace('-','/'));
    });
</script>     
</div> 
  