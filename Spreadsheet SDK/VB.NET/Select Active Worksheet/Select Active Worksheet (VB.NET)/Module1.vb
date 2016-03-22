﻿'*******************************************************************
'       ByteScout Spreadsheet SDK
'                                                                   
'       Copyright © 2016 Bytescout, http://www.bytescout.com        
'       ALL RIGHTS RESERVED                                         
'                                                                   
'*******************************************************************

Imports Bytescout.Spreadsheet
Imports System.IO

Module Module1

    Sub Main()
        ' Create new Spreadsheet
        Dim document As New Spreadsheet()

        ' Add new worksheets
        Dim worksheet1 As Worksheet = document.Workbook.Worksheets.Add("Worksheet1")
        Dim worksheet2 As Worksheet = document.Workbook.Worksheets.Add("Worksheet2")
        Dim worksheet3 As Worksheet = document.Workbook.Worksheets.Add("Worksheet3")

        ' Activate worksheet2
        worksheet2.Active = True


        ' remove output file if already exists
        If File.Exists("Output.xls") Then
            File.Delete("Output.xls")
        End If

        ' Save document
        document.SaveAs("Output.xls")

        ' Close Spreadsheet
        document.Close()

        ' open in default spreadsheets viewer/editor
        Process.Start("Output.xls")

    End Sub

End Module