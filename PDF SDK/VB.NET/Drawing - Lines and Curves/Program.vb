'*******************************************************************
'       ByteScout PDF SDK
'                                                                   
'       Copyright © 2016 Bytescout, http://www.bytescout.com        
'       ALL RIGHTS RESERVED                                         
'                                                                   
'*******************************************************************

Imports Bytescout.PDF

''' <summary>
''' This example demonstrates how to draw lines and curves.
''' </summary>
Class Program

    Shared Sub Main()

        ' Create new document
        Dim pdfDocument = New Document()
        pdfDocument.RegistrationName = "demo"
		pdfDocument.RegistrationKey = "demo"
        ' Add page
        Dim page = New Page(PaperFormat.A4)
        pdfDocument.Pages.Add(page)

        Dim canvas = page.Canvas

        Dim solidPen = New SolidPen()
        Dim dashedPen = New SolidPen()
        dashedPen.DashPattern = New DashPattern(New Single() {2, 2})

        ' Draw dashed lines
        canvas.DrawLine(dashedPen, 100, 100, 200, 100)
        canvas.DrawLine(dashedPen, 200, 100, 200, 200)
        canvas.DrawLine(dashedPen, 200, 200, 100, 200)
        ' Draw besier curve by the same points
        canvas.DrawCurve(solidPen, 100, 100, 200, 100, 200, 200, 100, 200)

        ' Save document to file
        pdfDocument.Save("result.pdf")

        ' Cleanup 
		pdfDocument.Dispose()

        ' Open document in default PDF viewer app
        Process.Start("result.pdf")

    End Sub

End Class
